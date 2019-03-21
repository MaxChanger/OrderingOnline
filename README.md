## [模拟] 食堂在线订餐系统

> 集合了多个GitHub项目<感谢各位大神>，同时也自己手写了一部分，整个项目流程完成了，但是细节处仍需要加强和完善

- 登录界面 [链接](https://github.com/fanrunqi/MaterialLogin)
- 食堂列表 & 个人主页 【手写略丑】
  - 其中用到了库  [链接](<https://github.com/open-android/PullToRefresh>)
- 防饿了吗点餐主页 [链接](https://github.com/wudifamo/Neleme)
- 结算页面 [链接](https://github.com/a5533348/PayUI/)

### 各个包功能

- **Windows**
  - WindowsActivity 食堂列表界面，点击某食堂进入其食堂主页
  - SettingActivity 个人设置界面

- **payui**
  - 结算界面，该包的功能是实现防支付界面
- **Login**
  - 包括注册界面和登录界面
- **MainActivity**
  - 食堂点餐主页面，添加购物车
- **bean/adapters**
  - 实现ListView

![动态展示](./imgshow.gif)