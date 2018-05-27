import React, { Component } from 'react'
import { requireNativeComponent } from 'react-native'
import PropTypes from 'prop-types'

const FragmentList = requireNativeComponent('FragmentList', FragmentListView)

export default class FragmentListView extends Component {
  render () {
    return <FragmentList {...this.props} />
  }
}

FragmentListView.propTypes = {
}
