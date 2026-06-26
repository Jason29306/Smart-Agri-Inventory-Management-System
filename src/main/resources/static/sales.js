document.getElementById("salesForm")
.addEventListener("submit", async function(e){

    e.preventDefault();

    const sale = {

        productId:
        parseInt(document.getElementById("productId").value),

        quantity:
        parseInt(document.getElementById("quantity").value),

        amount:
        parseFloat(document.getElementById("amount").value),

        saleDate:
        document.getElementById("saleDate").value
    };

    await fetch(
        "http://localhost:8080/sales",
        {
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            },
            body:JSON.stringify(sale)
        }
    );

    alert("Sale Added");

    loadSales();
});

async function loadSales(){

    const response =
    await fetch("http://localhost:8080/sales");

    const sales =
    await response.json();

    let rows = "";

    sales.forEach(s => {

        rows += `
        <tr>
            <td>${s.id}</td>
            <td>${s.productId}</td>
            <td>${s.quantity}</td>
            <td>${s.amount}</td>
            <td>${s.saleDate}</td>
        </tr>
        `;
    });

    document.getElementById("salesTable")
    .innerHTML = rows;
}

loadSales();