export async function fetchDataSongs() {
    const data = await fetch("http://localhost:9090/songs", {method:"GET"})
        .then((response)=>{
            //console.log(response)
            return response.json()
        })
    //console.log(data)
    return data
}


