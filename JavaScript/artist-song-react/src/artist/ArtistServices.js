export async function fetchDataArtists() {
    const data = await fetch("http://localhost:9090/artists", {method:"GET"})
        .then((response)=>{
            return response.json()
        })
    return data
}


