function fetchUserData() {
    fetch('http://localhost:9090/users')
        .then(respone => respone.json())
        .then((dataUser) => {
            let output = '<table>' +
                '<tr><th>No</th>' +
                '<th>Id</th>' +
                '<th>Username</th>' +
                '<th>Name</th>' +
                '<th>Email</th>' +
                '</tr>';
            console.log(dataUser);
            var no = 1;
            /*
            * perulangan terjadi di sini
            * */
            dataUser.forEach(function (users) {
                output += `<tr></tr><td>${no++}</td>`;
                output += `<td>${users.id}</td>`;
                output += `<td>${users.username}</td>`;
                output += `<td>${users.firstName}${users.lastName}</td>`;
                output += `<td>${users.email}</td>`;
                output += '</tr>';
            });
            document.querySelector(".responseUser").innerHTML = output;
        })
}

function fetchStoreData() {
    fetch('http://localhost:9090/storeslist').then(respone => respone.json())
        .then((dataStore) => {
            let output = '<table>' +
                '<tr><th>No</th>' +
                '<th>Id</th>' +
                '<th>Store Name</th>' +
                '<th>Address</th>' +
                '<th>Description</th>' +
                '<th>Phone Number</th>' +
//                '<th>Products</th>' +
                '</tr>';
            console.log(dataStore);
            var no = 1;
            /*
            * Perulangan*/
            dataStore.forEach(function (store) {
                output += `<tr></tr><td>${no++}</td>`;
                output += `<td>${store.id}</td>`;
                output += `<td>${store.storeName}</td>`;
                output += `<td>${store.address}</td>`;
                output += `<td>${store.description}</td>`;
                output += `<td>${store.phoneNumber}</td>`;
                // output += `<td>${store.products}</td>`;
                output += '</tr>';
            });
            document.querySelector(".responseUser").innerHTML = output;
        })
}

function fetchProductData() {
    fetch('http://localhost:9090/products').then(respone => respone.json())
        .then((dataProducts) => {
            console.log(dataProducts);
            let output = '<table>' +
                '<tr><th>No</th>' +
                '<th>Id</th>' +
                '<th>Product Name</th>' +
                '<th>Qty</th>' +
                '<th>Price</th>' +
                '</tr>';
            console.log(dataProducts);
            var no = 1;
            /*
            * Perulangan
            * */
            dataProducts.forEach(function (product) {
                output += `<tr></tr><td>${no++}</td>`;
                output += `<td>${product.id}</td>`;
                output += `<td>${product.productName}</td>`;
                output += `<td>${product.qty}</td>`;
                output += `<td> Rp. ${product.price}</td>`;
                output += '</tr>';
            });
            document.querySelector(".responseUser").innerHTML = output;
        })
}
