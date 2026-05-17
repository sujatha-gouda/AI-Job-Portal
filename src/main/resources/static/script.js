function login() {

    let role = document.getElementById("role").value;

    if (role === "Student") {

        window.location.href = "student-dashboard.html";

    }

    else {

        window.location.href = "recruiter-dashboard.html";

    }

}



async function addJob() {

    const job = {

        title: document.getElementById("title").value,

        company: document.getElementById("company").value,

        skills: document.getElementById("skills").value,

        salary: document.getElementById("salary").value,

        description: document.getElementById("description").value

    };

    const response = await fetch("http://localhost:8080/jobs/add", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(job)

    });

    const data = await response.json();

    alert("Job Added Successfully");

    console.log(data);

}