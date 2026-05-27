const API_BASE_URL =
    "http://localhost:8080";

// LOGIN

async function login(){

    const username =
        document.getElementById("username").value;

    const password =
        document.getElementById("password").value;

    console.log(username,password);

    const response = await fetch(

        "http://localhost:8080/api/auth/login",

        {

            method:"POST",

            headers:{
                "Content-Type":"application/json"
            },

            body:JSON.stringify({

                username: username,
                password: password

            })

        }

    );

    console.log(response.status);

    const data =
        await response.json();

    console.log(data);

    if(!response.ok){

        alert("Invalid Credentials");

        return;
    }

    localStorage.setItem(
        "token",
        data.token
    );

    localStorage.setItem(
        "role",
        data.role
    );

    alert("Login Successful");

    window.location.href =
        "dashboard.html";
}
// LOGOUT

function logout(){

    localStorage.clear();

    window.location.href =
        "login.html";
}

// DASHBOARD CHECK

if(window.location.pathname.includes("dashboard")){

    const token =
        localStorage.getItem("token");

    if(!token){

        window.location.href =
            "login.html";
    }
}

// NAVIGATION

function showSection(id){

    document.querySelectorAll("section")
        .forEach(sec =>
            sec.classList.add("hidden")
        );

    document.getElementById(id)
        .classList.remove("hidden");
}

// LOAD EMPLOYEES

async function loadEmployees(){

    const response = await fetch(

        `${API_BASE_URL}/api/employees`
    );

    const employees =
        await response.json();

    document.getElementById(
        "employeeCount"
    ).innerHTML =
        employees.length;

    const tbody =
        document.getElementById(
            "employeeTableBody"
        );

    if(!tbody) return;

    tbody.innerHTML = "";

    employees.forEach(emp => {

        tbody.innerHTML += `

            <tr>

                <td>${emp.id}</td>

                <td>${emp.name}</td>

                <td>${emp.email}</td>

                <td>${emp.department}</td>

                <td>₹${emp.salary}</td>

                <td>

                    <button
                        class="btn-primary"
                        onclick="deleteEmployee(${emp.id})">

                        Delete

                    </button>

                </td>

            </tr>

        `;
    });
}

// ADD EMPLOYEE

async function addEmployee(){

    const employee = {

        name:
            document.getElementById("name").value,

        email:
            document.getElementById("email").value,

        department:
            document.getElementById("department").value,

        salary:
            Number(
                document.getElementById("salaryInput").value
            )
    };

    const response = await fetch(

        `${API_BASE_URL}/api/employees`,

        {

            method:"POST",

            headers:{
                "Content-Type":"application/json"
            },

            body:JSON.stringify(employee)
        }

    );

    if(response.ok){

        alert("Employee Added");

        loadEmployees();

    }else{

        alert("Failed");
    }
}

// DELETE EMPLOYEE

async function deleteEmployee(id){

    await fetch(

        `${API_BASE_URL}/api/employees/${id}`,

        {
            method:"DELETE"
        }

    );

    loadEmployees();
}

// GENERATE SALARY

async function generateSalarySlip(){

    const salaryData = {

        employeeId:
            Number(
                document.getElementById("employeeId").value
            ),

        basicSalary:
            Number(
                document.getElementById("basicSalary").value
            ),

        hra:
            Number(
                document.getElementById("hra").value
            ),

        bonus:
            Number(
                document.getElementById("bonus").value
            ),

        deductions:
            Number(
                document.getElementById("deductions").value
            )
    };

    const response = await fetch(

        `${API_BASE_URL}/api/salary/generate`,

        {

            method:"POST",

            headers:{
                "Content-Type":"application/json"
            },

            body:JSON.stringify(salaryData)
        }

    );

    if(response.ok){

        alert("Salary Generated");

        loadSalarySlips();

    }
}

// LOAD SALARY SLIPS

async function loadSalarySlips(){

    const response = await fetch(

        `${API_BASE_URL}/api/salary/all`
    );

    const slips =
        await response.json();

    document.getElementById(
        "salaryCount"
    ).innerHTML =
        slips.length;

    const container =
        document.getElementById(
            "salarySlipContainer"
        );

    if(!container) return;

    container.innerHTML = "";

    slips.forEach(slip => {

        container.innerHTML += `

            <div class="salary-card">

                <h3>
                    Employee ID :
                    ${slip.employeeId}
                </h3>

                <p>
                    Basic Salary :
                    ₹${slip.basicSalary}
                </p>

                <p>
                    HRA :
                    ₹${slip.hra}
                </p>

                <p>
                    Bonus :
                    ₹${slip.bonus}
                </p>

                <p>
                    Deductions :
                    ₹${slip.deductions}
                </p>

                <h3>
                    Total :
                    ₹${slip.totalSalary}
                </h3>

            </div>

        `;
    });
}



if(window.location.pathname.includes("dashboard")){

    loadEmployees();

    loadSalarySlips();
}