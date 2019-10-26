import React, {Component} from 'react';
import ArtistCard from "./ArtistCard";
import {fecthData} from "./ArtistServices";

class ArtistContainer extends Component{
    constructor(props) {
        super(props);
        this.state={
            artists:[]
        }
    }
    componentDidMount() {
        this.fecthArtist()
    }
    fecthArtist =async ()=>{
        const data = await fecthData();
        console.log(data);
        if (!(data===undefined)){
            this.setState({artists:data})
        }
    }
    render() {
        return(
            <div>
                {this.state.artists.map(artist=>{
                    return <h2>Nama Artis : {artist.name}</h2>
                })}
            </div>
        )
    }
}
export default ArtistContainer;
