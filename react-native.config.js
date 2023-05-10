const android = require("@react-native-community/cli-platform-android");

module.exports = {
  platforms: {
    android: {
      projectConfig: android.projectConfig,
      dependencyConfig: android.dependencyConfig,
    },
  },

  project: {
    android: {
      appName: "study",
      packageName: "com.example.study",
      sourceDir: './'
    },
  },
};
