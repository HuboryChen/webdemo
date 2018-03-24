function addOnclick()
{
	layer.open({
				type: 2,
				skin: 'layui-layer-demo',
				title: '新增日常绩效',
				shadeClose: true,
				shade: 0.4,
				closeBtn: 1,
				maxHeight:600,
				maxmin: false,
				area: ['70%', '75%'],
				content: 'adddaily.html'
		});
}

function detail()
{
	layer.open({
				type: 2,
				skin: 'layui-layer-demo',
				title: '日常绩效详情',
				shadeClose: true,
				shade: 0.4,
				closeBtn: 1,
				maxHeight:600,
				maxmin: false,
				area: ['70%', '75%'],
				content: 'dailydetail.html'
		});
}
