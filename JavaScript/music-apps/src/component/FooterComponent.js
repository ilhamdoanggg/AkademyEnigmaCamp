import React, {Component} from 'react';

class FooterComponent extends Component{
    render() {
        return (
            <div>
                <footer className="page-footer light-blue lighten-1">
                    <section className="container">
                        <div className="row">
                            <div className="col l4 s12">
                                <h5 className="white-text">Lorem</h5>
                                <p className="grey-text text-lighten-4">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                                    esse cillum dolore eu fugiat nulla pariatur. culpa qui officia deserunt mollit anim id est laborum</p>


                            </div>
                            <div className="col l3 s12">
                                <h5 className="white-text">Lorem</h5>
                                <ul>
                                    <li><a className="white-text" href="#!">Link 3</a></li>
                                    <li><a className="white-text" href="#!">Link 4</a></li>
                                </ul>
                            </div>
                            <div className="col l3 s12">
                                <h5 className="white-text">Lorem</h5>
                                <ul>
                                    <li><a className="white-text" href="#!">Link 4</a></li>
                                </ul>
                            </div>
                        </div>
                    </section>
                    <div className="footer-copyright">
                        <div className="container">
                            Made by <a className="orange-text text-lighten-3"
                                       href="http://ilhamdoanggg.com">Ilhamdoanggg</a>
                        </div>
                    </div>
                </footer>
            </div>
        );
    }
}
export default FooterComponent;
