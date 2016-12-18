Vue.component('todo-item',{
	template:'<li>{{name}}</li>',
	props:{
		name:String
	}
})
var app=new Vue({
	el:'#vue1',
	data:{
		message:'hello',
		title:'v-bind',
		seen:false,
		myname:'gao',
		aas:[
			{text:'1'},
			{text:'2'},
			{text:'3'},
			{text:'4'}
		]

	},
	methods:{
			go:function(){
				this.aas.push({text:5});
			}
	}
})

