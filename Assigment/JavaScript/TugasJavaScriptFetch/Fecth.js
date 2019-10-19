fetch('http://localhost:9090/users').then(respone => respone.json())
    .then((dataUser) => {
        console.log(dataUser);
        fetchUserData = () => {
            document.querySelector('.responseUser').innerHTML = JSON.stringify(dataUser)
        }
    })

fetch('http://localhost:9090/storeslist').then(respone => respone.json())
    .then((dataStore) => {
        console.log(dataStore);
        fetchStoreData= () => {
            document.querySelector('.responseStore').innerHTML = JSON.stringify(dataStore)
        }
    })
fetch('http://localhost:9090/products').then(respone => respone.json())
    .then((dataProducts) => {
        console.log(dataProducts);
        fetchProductData = () => {
            document.querySelector('.responseProduct').innerHTML = JSON.stringify(dataProducts)
        }
    })
