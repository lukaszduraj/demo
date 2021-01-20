var path = require('path');
module.exports = {
    entry: './src/main/ts/index.tsx',
    devtool: 'source-map',
    cache: true,
    mode: 'production',
    output: {
        path: __dirname,
        filename: './src/main/resources/static/built/bundle.js'
    },

    resolve: {
        modules: [
            './src/main/ts',
            './node_modules'
        ],
        extensions: [".ts", ".tsx", ".js", ".json"],
    },
    module: {
        rules: [
            {
                test: /\.ts(x?)$/,
                exclude: /node_modules/,
                use: [
                    {
                        loader: "ts-loader"
                    }
                ]
            },
        ]
    }
};