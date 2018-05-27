import React, {Component} from 'react'
import {Platform, StyleSheet, Text, View} from 'react-native'
import Fragment from './FragmentListNativeView'

export default class App extends Component {
  render() {
    return (
      <View
        style={{
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF'
      }}>
        <Fragment style={{ flex: 1, width: 200, height: 200 }}/>
        <Text>I'm under a Native Android Fragment!!!</Text>
      </View>
    );
  }
}
