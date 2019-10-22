import React from "react";
class FooterComponent extends React.Component{
    render() {
        return (
            <div>
                <footer>
                    <section className="ft-social">
                        <ul className="ft-social-list">
                            <li><a href="#"><i className="fab fa-facebook"></i></a></li>
                            <li><a href="#"><i className="fab fa-twitter"></i></a></li>
                            <li><a href="#"><i className="fab fa-instagram"></i></a></li>
                            <li><a href="#"><i className="fab fa-github"></i></a></li>
                            <li><a href="#"><i className="fab fa-linkedin"></i></a></li>
                            <li><a href="#"><i className="fab fa-youtube"></i></a></li>
                        </ul>
                    </section>
                </footer>
            </div>
        );
    }
}
export default FooterComponent;
