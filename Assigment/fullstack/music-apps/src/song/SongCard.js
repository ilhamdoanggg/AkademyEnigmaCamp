import React, {Component} from 'react';

class SongCard extends Component {
    render() {
        return (
                    <section className="card">
                    <div className="card-cascade narrower">
                        <div className="card-panel">
                            <img src="" alt="logo" className=""/>
                            <p>Song Name {this.props.data.songName}</p>
                            <p>Date Release {this.props.data.release}</p>
                            <p>Artist {this.props.data.idArtist}</p>
                        </div>

                    </div>
                    </section>
            );
    }
}
export default SongCard;
