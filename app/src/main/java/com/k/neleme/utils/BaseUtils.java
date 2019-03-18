package com.k.neleme.utils;


import android.content.Context;

import com.k.neleme.bean.CommentBean;
import com.k.neleme.bean.FoodBean;
import com.k.neleme.bean.TypeBean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseUtils {
	public static List<TypeBean> getTypes() {
		ArrayList<TypeBean> tList = new ArrayList<>();
		//		for (int i = 0; i < 10; i++) {
		//			TypeBean typeBean = new TypeBean();
		//			typeBean.setName("类别" + i);
		//			tList.add(typeBean);
		//		}
		TypeBean typeBean6 = new TypeBean();typeBean6.setName("限时优惠");tList.add(typeBean6);
		TypeBean typeBean0 = new TypeBean();typeBean0.setName("品质套餐");tList.add(typeBean0);
		TypeBean typeBean2 = new TypeBean();typeBean2.setName("奶茶甜品");tList.add(typeBean2);
		TypeBean typeBean3 = new TypeBean();typeBean3.setName("地方特色");tList.add(typeBean3);
		TypeBean typeBean4 = new TypeBean();typeBean4.setName("小吃炸串");tList.add(typeBean4);
		TypeBean typeBean5 = new TypeBean();typeBean5.setName("民族风味");tList.add(typeBean5);
		TypeBean typeBean1 = new TypeBean();typeBean1.setName("面食粥点");tList.add(typeBean1);
		TypeBean typeBean7 = new TypeBean();typeBean7.setName("香锅冒菜");tList.add(typeBean7);
		return tList;
	}

	public static List<FoodBean> getDatas(Context context) {
		ArrayList<FoodBean> fList = new ArrayList<>();
		for (int i = 0; i < 91; i++) {
			FoodBean foodBean = new FoodBean();
			foodBean.setId(i);
			foodBean.setName("食品-" + i + 1);
			foodBean.setPrice(BigDecimal.valueOf((new Random().nextDouble() * 10)).setScale(1, BigDecimal.ROUND_HALF_DOWN));
			foodBean.setSale("月售" + new Random().nextInt(100));
			foodBean.setType("类别" + i / 10);
			int resID = context.getResources().getIdentifier("food" + new Random().nextInt(8), "drawable", "com.k.neleme");
			foodBean.setIcon(resID);
			fList.add(foodBean);
		}
		return fList;
	}

	public static List<FoodBean> getDetails(List<FoodBean> fList) {
		ArrayList<FoodBean> flist = new ArrayList<>();
		for (int i = 1; i < 5; i++) {
			if (fList.size() > i * 10) {
				flist.add(fList.get(i * 10 - 1));
				flist.add(fList.get(i * 10));
			} else {
				break;
			}
		}
		return flist;
	}

	public static List<CommentBean> getComment() {
		ArrayList<CommentBean> cList = new ArrayList<>();
		for (int i = 0; i < 15; i++) {
			cList.add(new CommentBean("第"+i+"条测试评论"));
		}
		return cList;
	}
}
