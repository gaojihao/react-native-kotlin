module.exports = {
  presets: ['module:metro-react-native-babel-preset'],
  plugins: [
      [
          'module-resolver',
          {
              root: ['./src'],
              extensions: ['.js', '.ts', '.d.ts', '.tsx', '.ios.js', '.android.js'],
          },
      ],
      '@babel/plugin-transform-runtime',
      '@babel/plugin-proposal-optional-chaining',
  ],
};
