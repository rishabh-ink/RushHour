/*
 * 
 * SpyBug
 * version 1.0 (beta)
 * 
 * Developed by Rishabh Rao
 * rishabhsrao.wordpress.com
 * rishabhsrao@gmail.com
 * twitter.com/rishabhsrao
 * 
 */

/*
	SpyBug is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.
	
	SpyBug is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.
	
	You should have received a copy of the GNU General Public License
	along with SpyBug.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * SpyBug provides a simple framework for logging and debugging using
 * the browser's native console.
 */
function SpyBug(){	
	/**
	 * Specifies whether logging is enabled or not.
	 */
	var isLoggingEnabled = true;
		
	/**
	 * A message containing status information,
	 * which is usually displayed with a round, blue exclamation icon.
	 */
	this.INFO = "info";
	
	/**
	 * A debug message which is used for temporarily displaying log messages.
	 * Note: This may not be compatible with Internet Explorer.
	 */
	this.DEBUG = "debug";
	
	/**
	 * A warning message,
	 * which is usually displayed with a triangular, yellow exclamation icon.
	 */
	this.WARN = "warn";
	
	/**
	 * An error message which is usually displayed with a round, red X icon.
	 */
	this.ERROR = "error";
	
	/**
	 * A simple log message. This is the default log message.
	 */
	this.LOG = "log";	

	/**
	 * Enables or disables logging.
	 * @param {Boolean} <code>val</code> The new logging status.
	 * <code>true</code> enables; <code>false</code> disables. 
	 */
	this.setLoggingStatus = function(val){
		switch(val){
			case false:
				isLoggingEnabled = false;
				break;
			
			case true:
			default:
				isLoggingEnabled = true;
				break;
		}
	}
	
	/**
	 * Gets the status of whether logging is enabled or disabled.
	 * @return isLoggingEnabled The current logging status.
	 */
	this.getLoggingStatus = function(){
		return isLoggingEnabled;
	}
	
	/**
	 * Logs the given message to the browser console.
	 * Prefixes the current date and time to the message.
	 * @param {String} <code>message</code> The contents of the message.
	 * @param {Object} <code>type</code> The type of log message.
	 */
	this.spy = function(message, type){
		if (isLoggingEnabled) {
			if (typeof(console) !== 'undefined' && console != null) {
				// Create a new <code>Date</code> object
				// so that it holds the current time.
				var now = new Date();
				
				// Build a timestamp string.
				var timestamp = now.toLocaleDateString() +
								" " +
								now.toLocaleTimeString() +
								": ";
				
				// Log the message based on the type.
				switch (type) {
					case this.INFO:
						console.info(timestamp + message);
						break;
						
					case this.DEBUG:
						console.debug(timestamp + message);
						break;
						
					case this.WARN:
						console.warn(timestamp + message);
						break;
						
					case this.ERROR:
						console.error(timestamp + message);
						break;
						
					case this.LOG:					
					default:
						console.log(timestamp + message);
						break;
				}
			}
		}
	}
	
	/**
	 * Returns a string representation of this <code>JSLogger</code> object.
	 */
	this.toString = function(){
		return ("SpyBug: Logging is " +
				(this.getLoggingStatus() ? "enabled" : "disabled") + ".");
	}
}