document.getElementById("purchaseForm")
.addEventListener("submit", async function(e){

    e.preventDefault();

    const purchase = {

        productId:
        parseInt(document.getElementById("productId").value),

        supplierId:
        parseInt(document.getElementById("supplierId").value),

        quantity:
        parseInt(document.getElementById("quantity").value),

        cost:
        parseFloat(document.getElementById("cost").value),

        purchaseDate:
        document.getElementById("purchaseDate").value
    };

    await fetch(
        "http://localhost:8080/purchases",
        {
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            },
            body:JSON.stringify(purchase)
        }
    );

    alert("Purchase Added");

    loadPurchases();
});

async function loadPurchases(){

    const response =
    await fetch("http://localhost:8080/purchases");

    const purchases =
    await response.json();

    let rows = "";

    purchases.forEach(p => {

        rows += `
        <tr>
            <td>${p.id}</td>
            <td>${p.productId}</td>
            <td>${p.supplierId}</td>
            <td>${p.quantity}</td>
            <td>${p.cost}</td>
        </tr>
        `;
    });

    document.getElementById("purchaseTable")
    .innerHTML = rows;
}

loadPurchases();