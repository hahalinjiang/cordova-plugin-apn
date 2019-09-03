var exec = require('cordova/exec');

exports.toSettingApn = function () {
    exec(null, null, 'SkyApn', 'toSettingApn', null);
};
