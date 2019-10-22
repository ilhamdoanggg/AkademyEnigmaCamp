import React, {Component} from 'react';

class Toogle extends Component {
    constructor(props){
        super(props)
        this.state={
            toogleStatus:true
        }
        this.handleClick = this.handleClick.bind(this)
    }
    handleClick(){
        this.setState( state =>({
            toogleStatus: !state.toogleStatus
        }))
    }
    render() {
        return(
            <button onClick={this.handleClick}>
                Kondisi Sekarang  {this.state.toogleStatus ? 'ON':'OFF'}
            </button>
        )
    }
}
export default Toogle;
