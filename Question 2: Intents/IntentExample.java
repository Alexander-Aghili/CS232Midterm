
public class IntentExample {
	
	//An Explicit intent is used to launch a component of the same app.
	//This is useful for launching another activity or a new service.
	//You must specify the component being launched prior explicitly in the intent creation,
	//hence the name.
	//An example of an explicit intent is shown below:
	Intent expI = new Intent(getApplicationContext(), History.class);
   	expI.putExtra("HistoryString", historyString);
    	startActivity(expI);
    
	//An implicit intent can invoke any app to perform the requested action.
	//This means that the intent can call any app across the device if needed.
	//You only must specifiy a general action to be performed, instead of launching
	//a specific component as seen with the explicit intent.
	//An example of an implicit intent is shown below:
	Intent impI = new Intent();
	impI.setAction(Intent.ACTION_SEARCH);
	impI.putExtra(Intent.EXTRA_TEXT, query);

	try {
		startActivity(impI);
	} catch (ActivityNotFoundException e) {
		//Deal With Error
	}
}
