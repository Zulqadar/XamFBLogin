package crc64b3dd32ae6f5aed22;


public class FacebookLoginButtonRenderer
	extends crc643f46942d9dd1fff9.ViewRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("XamFBLogin.Droid.FacebookLoginButtonRenderer, XamFBLogin.Android", FacebookLoginButtonRenderer.class, __md_methods);
	}


	public FacebookLoginButtonRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == FacebookLoginButtonRenderer.class) {
			mono.android.TypeManager.Activate ("XamFBLogin.Droid.FacebookLoginButtonRenderer, XamFBLogin.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public FacebookLoginButtonRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == FacebookLoginButtonRenderer.class) {
			mono.android.TypeManager.Activate ("XamFBLogin.Droid.FacebookLoginButtonRenderer, XamFBLogin.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public FacebookLoginButtonRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == FacebookLoginButtonRenderer.class) {
			mono.android.TypeManager.Activate ("XamFBLogin.Droid.FacebookLoginButtonRenderer, XamFBLogin.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

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
