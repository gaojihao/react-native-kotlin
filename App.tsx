import React, { Component } from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { routes } from './routes';

const Stack = createNativeStackNavigator();

class App extends Component {
  
  render() {
    console.log('routes', routes);
    return (
      <NavigationContainer>
        <Stack.Navigator>
          {routes.map(item => <Stack.Screen name={item.key} key={item.key} component={item.component} options={{ title: item.title }} />)}
        </Stack.Navigator>
      </NavigationContainer>
    );
  }
}

export default App;
