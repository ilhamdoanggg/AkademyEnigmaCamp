import React, {Component} from 'react';
import SongCard from "./SongCard";
import {fetchPageArtistService} from "./SongServices";
import SongForm from "./SongForm";

class SongContainer extends Component {
    constructor(props) {
        super(props);
        this.state = { songs: [],
            songForm: {
                songName: "",
                idArtistTrancient: "",
                release: ""
            },
            activePage: 0,
            totalPage: null
        }
    }
    componentDidMount= () => {
        this.fetchData();
    }
    fetchData = async (page) => {
        let dataSongPages;
        if (page===undefined){
            dataSongPages = await fetchPageArtistService(this.state.activePage);
        } else {
            dataSongPages = await fetchPageArtistService(page);
        }
        if (!(dataSongPages === undefined)) {
            this.setState({artists: dataSongPages.content})
        }
        console.log(this.state.activePage +  " Active");
        console.log(dataSongPages.pageable.pageNumber);
        this.setPagination(dataSongPages);
    }
    setPagination = (data) => {
        if (!(data === undefined)) {
            this.setState({
                totalPage: data.totalPages,
                activePage: data.pageable.pageNumber
            })
        }
    }
    handlePagination = (event) => {
        event.preventDefault();
        let page = parseInt(event.target.value);
        this.setState({
            activePage: page
        });
        this.fetchData(page);
    };

    render() {
        let paginations = [];
        for (let i = 0; i < this.state.totalPage; i++) {
            paginations.push(
                <button className="btn-floating waves-effect waves-light btn"
                        color="primary" onClick={this.handlePagination}
                        type="submit" value={i}
                        style={{margin: "10px"}}>{i+1}</button>
            );
        }
        return (
            <div className="container">
                <SongForm/>
                {this.state.songs.map(items => {
                    return <SongCard data={items}/>
                })}
                <br/>
                {paginations}
            </div>
        );
    }
}
export default SongContainer;
