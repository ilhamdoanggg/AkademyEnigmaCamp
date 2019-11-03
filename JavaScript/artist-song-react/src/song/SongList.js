import React,{Component} from 'react'
import {fetchDataSongs} from "./SongService";
import {connect} from "react-redux";

class SongList extends Component{

    async componentDidMount(){
        let data = await fetchDataSongs()
        console.log(data,"song")

        this.props.dispatch({type:'SUCCESS_FECTH_DATA_SONG', payload:data})
    }

    render() {
        console.log(this.props,"prop")
        return (
            <div>
                {
                    this.props.songs.map((element, index)=>{
                        return <h1>{element.release}</h1>
                    })
                }
            </div>
        );
    }
}
const mapStateToProps=(state)=>{
    return {...state}
}
export default connect(mapStateToProps)(SongList) ;
