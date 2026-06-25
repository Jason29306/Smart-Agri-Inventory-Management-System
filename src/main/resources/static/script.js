fetch('/products/dashboard')
.then(response => response.json())
.then(data => {

    document.getElementById("totalProducts").innerText =
        data.totalProducts;

    document.getElementById("lowStockProducts").innerText =
        data.lowStockProducts;
});
fetch('/products/low-stock')
.then(response => response.json())
.then(products => {

    let html = "";

    products.forEach(product => {
        html += `<li>${product.productName} - Qty: ${product.quantity}</li>`;
    });

    document.getElementById("lowStockList").innerHTML = html;
});