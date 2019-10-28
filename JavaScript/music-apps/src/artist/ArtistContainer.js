import React, {Component} from 'react';
import ArtistCard from "./ArtistCard";
import {fetchPageArtistService} from "./ArtistServices";
import ArtistForm from "./ArtistForm";

class ArtistContainer extends Component {
    constructor(props) {
        super(props);
        this.state = { artists: [],
            artistForm: {
                artistName: "",
                bornPlace: "",
                debut: ""
            },
            activePage: 0,
            totalPage: null
        }
    }
    componentDidMount= () => {
        this.fetchData();
    }
    fetchData = async (page) => {
        let dataArtistPage;
        if (page===undefined){
            dataArtistPage = await fetchPageArtistService(this.state.activePage);
        } else {
            dataArtistPage = await fetchPageArtistService(page);
        }
        if (!(dataArtistPage === undefined)) {
            this.setState({artists: dataArtistPage.content})
        }
        console.log(this.state.activePage +  " Active");
        console.log(dataArtistPage.pageable.pageNumber);
        this.setPagination(dataArtistPage);
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
                <ArtistForm/>
                {this.state.artists.map(items => {
                    return <ArtistCard data={items}/>
                })}
                <br/>
                {paginations}
            </div>
        );
    }
}
export default ArtistContainer;
