
export async function fetchDataArtists() {
    const data = await fetch("http://localhost:9090/artists", {method:"GET"})
        .then((response)=>{
            return response.json()
        })
    return data
}

export async function saveData(event) {
    const data = await fetch("http://localhost:9090/artist-images", {method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(event)})
        .then((response)=>{
            return response.json()
        }).catch(reason => {
//            console.log(reason)
        })
  //  console.log(data)
    return data
}

export async function fetchInsertDataArtistWithSong(event) {
    const data = await fetch("http://localhost:9090/artist", {method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(event)})
        .then((response)=>{
            return response.json()
        }).catch(reason => {
        })
    return data
}
// export async function fetchInsertDataArtist() {
//     const data = await fetch("http://localhost:9090/artist", {method:"POST"})
//         .then((response)=>{ return response.json()})
//     return data
// }


