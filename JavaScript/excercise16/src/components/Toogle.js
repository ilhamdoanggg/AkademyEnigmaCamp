import React, {Component} from 'react';
import Button from "@material-ui/core/Button";

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
            <Button variant="contained" color="primary" onClick={this.handleClick}>
                Kondisi Sekarang  {this.state.toogleStatus ? 'ON':'OFF'}
            </Button>
        )
    }
}
export default Toogle;
