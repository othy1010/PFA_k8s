/**
 */
package k8s.impl;

import k8s.ExecAction;
import k8s.HTTPGetAction;
import k8s.K8sPackage;
import k8s.Probe;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.ProbeImpl#getHttpGet <em>Http Get</em>}</li>
 *   <li>{@link k8s.impl.ProbeImpl#getExec <em>Exec</em>}</li>
 *   <li>{@link k8s.impl.ProbeImpl#getInitialDelaySeconds <em>Initial Delay Seconds</em>}</li>
 *   <li>{@link k8s.impl.ProbeImpl#getTimeoutSeconds <em>Timeout Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbeImpl extends MinimalEObjectImpl.Container implements Probe {
	/**
	 * The cached value of the '{@link #getHttpGet() <em>Http Get</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpGet()
	 * @generated
	 * @ordered
	 */
	protected HTTPGetAction httpGet;

	/**
	 * The cached value of the '{@link #getExec() <em>Exec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExec()
	 * @generated
	 * @ordered
	 */
	protected ExecAction exec;

	/**
	 * The default value of the '{@link #getInitialDelaySeconds() <em>Initial Delay Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelaySeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_DELAY_SECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialDelaySeconds() <em>Initial Delay Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelaySeconds()
	 * @generated
	 * @ordered
	 */
	protected int initialDelaySeconds = INITIAL_DELAY_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutSeconds() <em>Timeout Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_SECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeoutSeconds() <em>Timeout Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutSeconds()
	 * @generated
	 * @ordered
	 */
	protected int timeoutSeconds = TIMEOUT_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.PROBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPGetAction getHttpGet() {
		if (httpGet != null && httpGet.eIsProxy()) {
			InternalEObject oldHttpGet = (InternalEObject)httpGet;
			httpGet = (HTTPGetAction)eResolveProxy(oldHttpGet);
			if (httpGet != oldHttpGet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.PROBE__HTTP_GET, oldHttpGet, httpGet));
			}
		}
		return httpGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPGetAction basicGetHttpGet() {
		return httpGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpGet(HTTPGetAction newHttpGet) {
		HTTPGetAction oldHttpGet = httpGet;
		httpGet = newHttpGet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.PROBE__HTTP_GET, oldHttpGet, httpGet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecAction getExec() {
		if (exec != null && exec.eIsProxy()) {
			InternalEObject oldExec = (InternalEObject)exec;
			exec = (ExecAction)eResolveProxy(oldExec);
			if (exec != oldExec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.PROBE__EXEC, oldExec, exec));
			}
		}
		return exec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecAction basicGetExec() {
		return exec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExec(ExecAction newExec) {
		ExecAction oldExec = exec;
		exec = newExec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.PROBE__EXEC, oldExec, exec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialDelaySeconds() {
		return initialDelaySeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialDelaySeconds(int newInitialDelaySeconds) {
		int oldInitialDelaySeconds = initialDelaySeconds;
		initialDelaySeconds = newInitialDelaySeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.PROBE__INITIAL_DELAY_SECONDS, oldInitialDelaySeconds, initialDelaySeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeoutSeconds() {
		return timeoutSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutSeconds(int newTimeoutSeconds) {
		int oldTimeoutSeconds = timeoutSeconds;
		timeoutSeconds = newTimeoutSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.PROBE__TIMEOUT_SECONDS, oldTimeoutSeconds, timeoutSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.PROBE__HTTP_GET:
				if (resolve) return getHttpGet();
				return basicGetHttpGet();
			case K8sPackage.PROBE__EXEC:
				if (resolve) return getExec();
				return basicGetExec();
			case K8sPackage.PROBE__INITIAL_DELAY_SECONDS:
				return getInitialDelaySeconds();
			case K8sPackage.PROBE__TIMEOUT_SECONDS:
				return getTimeoutSeconds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.PROBE__HTTP_GET:
				setHttpGet((HTTPGetAction)newValue);
				return;
			case K8sPackage.PROBE__EXEC:
				setExec((ExecAction)newValue);
				return;
			case K8sPackage.PROBE__INITIAL_DELAY_SECONDS:
				setInitialDelaySeconds((Integer)newValue);
				return;
			case K8sPackage.PROBE__TIMEOUT_SECONDS:
				setTimeoutSeconds((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case K8sPackage.PROBE__HTTP_GET:
				setHttpGet((HTTPGetAction)null);
				return;
			case K8sPackage.PROBE__EXEC:
				setExec((ExecAction)null);
				return;
			case K8sPackage.PROBE__INITIAL_DELAY_SECONDS:
				setInitialDelaySeconds(INITIAL_DELAY_SECONDS_EDEFAULT);
				return;
			case K8sPackage.PROBE__TIMEOUT_SECONDS:
				setTimeoutSeconds(TIMEOUT_SECONDS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case K8sPackage.PROBE__HTTP_GET:
				return httpGet != null;
			case K8sPackage.PROBE__EXEC:
				return exec != null;
			case K8sPackage.PROBE__INITIAL_DELAY_SECONDS:
				return initialDelaySeconds != INITIAL_DELAY_SECONDS_EDEFAULT;
			case K8sPackage.PROBE__TIMEOUT_SECONDS:
				return timeoutSeconds != TIMEOUT_SECONDS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (initialDelaySeconds: ");
		result.append(initialDelaySeconds);
		result.append(", timeoutSeconds: ");
		result.append(timeoutSeconds);
		result.append(')');
		return result.toString();
	}

} //ProbeImpl
