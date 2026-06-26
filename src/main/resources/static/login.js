document.getElementById("loginForm")
.addEventListener("submit", async function(e){

    e.preventDefault();

    const user = {
        username: document.getElementById("username").value,
        password: document.getElementById("password").value
    };

    const response = await fetch(
        "http://localhost:8080/auth/login",
        {
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            },
            body:JSON.stringify(user)
        });

    const result = await response.text();

    if(result === "Login Successful"){
        alert("Login Successful");
        window.location.href = "index.html";
    }else{
        document.getElementById("result").innerText = result;
    }
});