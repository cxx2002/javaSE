package ˯������;

import java.util.concurrent.CountDownLatch;

public class SleepSort {

	public static void main(String[] args) {
		int nums[] = new int[] {1,2,45,23,11,26,8};
		sleepSort(nums);
		int max = findMAX(nums);
		System.out.println("MAX = "+max);
	}
	/**
	 * ���߳�˯������
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
	 * ���߳�˯�����������ֵ
	 * @param nums
	 */
	public static int findMAX(int[] nums) {
		CountDownLatch countDownLatch = 
				new CountDownLatch(nums.length);//�߳�ͬ��,��֤���е��̶߳�������
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
	 * ������¼���ֵ����ľ�̬�ڲ���
	 * @author ��ϲϲ
	 *
	 */
	private static class Result{
		private static volatile int INDEX = -1;//volatile��֤INDEX�Ŀɼ��Ժ�������
	}
}
