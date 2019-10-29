import React, {Component} from 'react';

class NavbarComponent extends Component{
    render() {
        return (
            <div className="App">
                <header>
                <nav className="light-blue lighten-1 nav-wrapper">
                    <section className="container">
                        <a href="#" className="brand-logo left">Music App</a>
                        <ul id="nav-mobile" className="left hide-on-med-and-down">
                        </ul>
                    </section>
                </nav>
                </header>
            </div>
        );
    }
}
export default NavbarComponent;
