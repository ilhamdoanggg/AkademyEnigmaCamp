
export async function fetchService() {
    const data = await fetch("http://localhost:9090/song", {method:"GET"})
        .then((response)=>{
            console.log(response)
            return response.json()
        })
    console.log(data)
    return data
}
export async function saveData(event) {
    const data = await fetch("http://localhost:9090/song", {method:"POST", headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(event)})
        .then((response)=>{
            return response.json()
        }).catch(reason => {
            console.log(reason)
        })
    console.log(data)
    return data
}
export async function fetchPageArtistService(page) {
    const data = await fetch(`http://localhost:9090/songs?page=${page}&size=8`, {method:"GET"})
        .then((response)=>{
            return response.json()
        })
    return data
}
