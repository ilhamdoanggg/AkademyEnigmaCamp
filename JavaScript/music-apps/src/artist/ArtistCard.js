import React, {Component} from 'react';

class ArtistCard extends Component {
    render() {
        return (
                    <section className="card">
                    <div className="card-cascade narrower">
                        <div className="card-panel">
                            <img src="" alt="logo" className=""/>
                            <p>Name Artist {this.props.data.name}</p>
                            <p>Tempat Asal {this.props.data.birdPlace}</p>
                            <p>Debut {this.props.data.debut}</p>
                        </div>

                    </div>
                    </section>
            );
    }
}
export default ArtistCard;
