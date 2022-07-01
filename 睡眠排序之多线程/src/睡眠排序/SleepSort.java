package 睡眠排序;

import java.util.concurrent.CountDownLatch;

public class SleepSort {

	public static void main(String[] args) {
		int nums[] = new int[] {1,2,45,23,11,26,8};
		sleepSort(nums);
		int max = findMAX(nums);
		System.out.println("MAX = "+max);
	}
	/**
	 * 多线程睡眠排序
	 * @param nums
	 */
	public static void sleepSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			final int num = nums[i];
			new Thread(()->{
				try {
					Thread.sleep(num);					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(num);
			}).start();
		}
	}
	/**
	 * 多线程睡眠排序找最大值
	 * @param nums
	 */
	public static int findMAX(int[] nums) {
		CountDownLatch countDownLatch = 
				new CountDownLatch(nums.length);//线程同步,保证所有的线程都运行完
		for (int i = 0; i < nums.length; i++) {
			final int num = nums[i];
			new Thread(()->{
				try {
					Thread.sleep(num);					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Result.INDEX = num;
				countDownLatch.countDown();//latch-1
			}).start();
		}
		try {
			countDownLatch.await();//?latch==0
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Result.INDEX;
	}
	/**
	 * 用来记录最大值结果的静态内部类
	 * @author 陈喜喜
	 *
	 */
	private static class Result{
		private static volatile int INDEX = -1;//volatile保证INDEX的可见性和有序性
	}
}
