document.getElementById("supplierForm")
.addEventListener("submit", async function(e){

    e.preventDefault();

    const supplier = {
        supplierName:
        document.getElementById("supplierName").value,

        phone:
        document.getElementById("phone").value,

        email:
        document.getElementById("email").value,

        address:
        document.getElementById("address").value
    };

    await fetch(
    "http://localhost:8080/suppliers",
    {
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(supplier)
    });

    alert("Supplier Added");
    loadSuppliers();
});

async function loadSuppliers(){

    const response =
    await fetch("http://localhost:8080/suppliers");

    const suppliers =
    await response.json();

    let rows = "";

    suppliers.forEach(s => {

        rows += `
        <tr>
            <td>${s.id}</td>
            <td>${s.supplierName}</td>
            <td>${s.phone}</td>
            <td>${s.email}</td>
        </tr>
        `;
    });

    document.getElementById("supplierTable")
    .innerHTML = rows;
}

loadSuppliers();