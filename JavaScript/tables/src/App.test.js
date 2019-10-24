import React from 'react';
import App from './App';
import {shallow, mount} from "enzyme";



describe('App Component', ()=> {
  describe('Render',  ()=> {
    const appContainer = shallow(<App/>)
    // it('should contain one Router as BrowserRouter', ()=> {
    //   expect(appContainer.find('Router')).toHaveLength(1)
    // });
    it('should contain three div', ()=> {
      expect(appContainer.find('div')).toHaveLength(3)
    });
    it('should contain one header component as a component', ()=> {
      expect(appContainer.find('div').children('HeaderComponent')).toHaveLength(1)
    });
    it('should contain two link component as a component', ()=> {
      expect(appContainer.find('div').children('Link')).toHaveLength(2)
    });
    it('should contain one Switch', ()=> {
      expect(appContainer.find('div').children('Switch')).toHaveLength(1)
    });
    it('should contain three Route', ()=> {
      expect(appContainer.find('Switch').children('Route')).toHaveLength(3)
    });
  });
});

