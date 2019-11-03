import React, {Component} from "react";
import {fetchDataArtists} from "./ArtistServices";
import {connect} from "react-redux";

class ArtistList extends Component{

    async componentDidMount() {
        let data =  await fetchDataArtists()
        // console.log(data)
        // console.log(this.props)
        this.props.dispatch({type:'SUCCESS_FECTH_DATA_ARTIST', payload:data})
    }

    render() {
        //console.log(this.props.artist)
        return (
                <div>
                    <tr>
                        <th>Id</th>
                        <th>name</th>
                        <th>Bird Place</th>
                        <th>debut</th>
                    </tr>
                    {
                        this.props.artist.map((element)=>{
                            return<table>
                                <tr>
                                    <td>{element.id}</td>
                                    <td>{element.name}</td>
                                    <td>{element.birdPlace}</td>
                                    <td>{element.debut}</td>
                                </tr></table>
                        })
                    }
                </div>
        );
    }
}

const mapStateToProps=(state)=>{
    return {...state}
}
export default connect(mapStateToProps)(ArtistList);
