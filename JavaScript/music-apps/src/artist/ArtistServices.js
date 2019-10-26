
export async function fecthData() {
    const data = await fetch("http://localhost:4488/artists", {method:"GET"})
        .then((res)=>{
            console.log(res);
            return res.json();
        })
    return data;
}
