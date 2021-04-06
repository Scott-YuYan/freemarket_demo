<!DOCTYPE html>
<html lang="zh-Hans">
<head>
    <meta charset="UTF-8">
    <title>freemarker_demo</title>
    <link rel="stylesheet" href="/static/css/style.css" type="text/css"/>
</head>
<body>

<div id="mainCLass">
    <div id="iframe">
        <table>
            <thead>
            <tr>
                <th colspan="6">个人人身保险投保单</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>姓名：</td>
                <td>${name!"Stranger"}</td>
                <td>证件类型：</td>
                <td>${cardType!"身份证"}</td>
                <td>证件有效期到期日：</td>
                <td>${expiring_date!"2021-04-06"}</td>
            </tr>
            <tr>
                <td>性别：</td>
                <td>男</td>
                <td>出生日期：</td>
                <td>1993年05月14日</td>
                <td>证件号码：</td>
                <td>142226199305153917</td>
            </tr>
            <tr>
                <td>国籍：</td>
                <td>中国</td>
                <td>婚姻状况：</td>
                <td>未婚</td>
                <td>投保人税收居民身份：</td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>