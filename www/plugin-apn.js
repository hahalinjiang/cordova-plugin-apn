var exec = require('cordova/exec');

exports.toSettingApn = function () {
    exec(null, null, 'SkyApn', 'toSettingApn', null);
};
exports.toSettingApn = function () {
    exec(null, null, 'SkyApn', 'toSettingNewApn', null);
};
