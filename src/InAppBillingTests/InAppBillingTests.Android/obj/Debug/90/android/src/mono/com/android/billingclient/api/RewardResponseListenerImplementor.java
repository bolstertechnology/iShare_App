package mono.com.android.billingclient.api;


public class RewardResponseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.android.billingclient.api.RewardResponseListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRewardResponse:(Lcom/android/billingclient/api/BillingResult;)V:GetOnRewardResponse_Lcom_android_billingclient_api_BillingResult_Handler:Android.BillingClient.Api.IRewardResponseListenerInvoker, Xamarin.Android.Google.BillingClient\n" +
			"";
		mono.android.Runtime.register ("Android.BillingClient.Api.IRewardResponseListenerImplementor, Xamarin.Android.Google.BillingClient", RewardResponseListenerImplementor.class, __md_methods);
	}


	public RewardResponseListenerImplementor ()
	{
		super ();
		if (getClass () == RewardResponseListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.BillingClient.Api.IRewardResponseListenerImplementor, Xamarin.Android.Google.BillingClient", "", this, new java.lang.Object[] {  });
	}


	public void onRewardResponse (com.android.billingclient.api.BillingResult p0)
	{
		n_onRewardResponse (p0);
	}

	private native void n_onRewardResponse (com.android.billingclient.api.BillingResult p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
