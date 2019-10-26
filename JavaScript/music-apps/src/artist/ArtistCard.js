import React, {Component} from 'react';

class ArtistCard extends Component{
    constructor(props) {
        super(props);
        this.state={
            artist:{name:""}
        }
    }
    componentDidMount() {
        if (!(this.props.artist===undefined)){
            this.setState({artist:this.props.artist})
        }
    }
    render() {
        return(
            <div>
                <h1>Card</h1>
                <h2>{this.props.artist.name}</h2>
            </div>
        )
    }
}
export default ArtistCard;
