export  async function fetchService() {
    const data = await  fetch('http://localhost:9090/artist',{method :'GET'})
        .then((resp)=>{console.log(resp)
            return resp.json()})
    return data;
}
export async function Submitdata(artistForm) {
    const data = await fetch('http://localhost:9090/artist',{method:'POST' ,headers:{'Content-Type':'application/json'} ,body:JSON.stringify(artistForm)})
        .then((response)=>{
            console.log(response)
            return response.json()
        }).catch(reason => {
            console.log(reason)
        })
    return data;
}
export  async function fetchtPagination(pageNumber) {
    const data = await  fetch(`http://localhost:9090/artists?size=20&page=${pageNumber}`,{method :'GET'})
        .then((resp)=>{console.log(resp)
            return resp.json()})
    return data;
}
/*
export async function fecthData() {
    const data = await fetch("http://localhost:9090/artists", {method:"GET"})
        .then((res)=>{
            console.log(res);
            return res.json();
        })
    return data;
}*/
