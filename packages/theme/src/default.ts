import { StyleSheet } from 'react-native';
// 基础颜色
const colors = {
  black: '#000000',
  white: '#ffffff',
  blue: '#00a0e9',
  red: '#ff666666',
  orange: '#f06e00',
  dark: '#333333',
  normal: '#666666',
  gray: '#999999',
  ccc: '#cccccc',
  eee: '#eeeeee',
  light: '#EFEFF4',
};

const gradientColors = {
  'gradient-red': '',
  'gradient-orange': '',
};

/**
 * 组件颜色
 */
const componentColors = {
  'primary-color': colors.blue,
  'success-color': colors.blue,
  'danger-color': colors.red,
  'warning-color': colors.orange,
  'text-color': colors.normal,
  'active-color': colors.dark,
  'active-opacity': 0.7,
  'disabled-opacity': 0.5,
  'background-color': colors.light,
  'background-color-light': '#fafafa',
  'text-link-color': '#576b95',
};

const paddingBase = 4;
/**
 * Padding
 */
const padding = {
  'padding-base': paddingBase,
  'padding-xs': paddingBase * 2,
  'padding-sm': paddingBase * 3,
  'padding-md': paddingBase * 4,
  'padding-lg': paddingBase * 6,
  'padding-xl': paddingBase * 8,
};

/**
 * Font
 */
const font = {
  'font-size-xs': 10,
  'font-size-sm': 12,
  'font-size-md': 14,
  'font-size-lg': 16,
  'font-weight-bold': 500,
  'line-height-xs': 14,
  'line-height-sm': 18,
  'ine-height-md': 20,
  'line-height-lg': 22,
};

export const border = {
  'border-color': colors['gray-3'],
  'border-width-base': 1,
  'border-width-hairline': StyleSheet.hairlineWidth,
  'border-radius-sm': 2,
  'border-radius-md': 4,
  'border-radius-lg': 8,
  'border-radius-max': 999,
};

export default {
  ...colors,
  ...gradientColors,
  ...componentColors,
  ...padding,
  ...font,
  ...border,
};
