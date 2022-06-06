/**
 */
package k8s.impl;

import java.util.Collection;
import k8s.HTTPGetAction;
import k8s.K8sPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTTP Get Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.HTTPGetActionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link k8s.impl.HTTPGetActionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link k8s.impl.HTTPGetActionImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link k8s.impl.HTTPGetActionImpl#getHttpHeaders <em>Http Headers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPGetActionImpl extends MinimalEObjectImpl.Container implements HTTPGetAction {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHttpHeaders() <em>Http Headers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<String> httpHeaders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPGetActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.HTTP_GET_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.HTTP_GET_ACTION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.HTTP_GET_ACTION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.HTTP_GET_ACTION__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHttpHeaders() {
		if (httpHeaders == null) {
			httpHeaders = new EDataTypeUniqueEList<String>(String.class, this, K8sPackage.HTTP_GET_ACTION__HTTP_HEADERS);
		}
		return httpHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.HTTP_GET_ACTION__PATH:
				return getPath();
			case K8sPackage.HTTP_GET_ACTION__PORT:
				return getPort();
			case K8sPackage.HTTP_GET_ACTION__SCHEME:
				return getScheme();
			case K8sPackage.HTTP_GET_ACTION__HTTP_HEADERS:
				return getHttpHeaders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.HTTP_GET_ACTION__PATH:
				setPath((String)newValue);
				return;
			case K8sPackage.HTTP_GET_ACTION__PORT:
				setPort((Integer)newValue);
				return;
			case K8sPackage.HTTP_GET_ACTION__SCHEME:
				setScheme((String)newValue);
				return;
			case K8sPackage.HTTP_GET_ACTION__HTTP_HEADERS:
				getHttpHeaders().clear();
				getHttpHeaders().addAll((Collection<? extends String>)newValue);
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
			case K8sPackage.HTTP_GET_ACTION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case K8sPackage.HTTP_GET_ACTION__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case K8sPackage.HTTP_GET_ACTION__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case K8sPackage.HTTP_GET_ACTION__HTTP_HEADERS:
				getHttpHeaders().clear();
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
			case K8sPackage.HTTP_GET_ACTION__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case K8sPackage.HTTP_GET_ACTION__PORT:
				return port != PORT_EDEFAULT;
			case K8sPackage.HTTP_GET_ACTION__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case K8sPackage.HTTP_GET_ACTION__HTTP_HEADERS:
				return httpHeaders != null && !httpHeaders.isEmpty();
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
		result.append(" (path: ");
		result.append(path);
		result.append(", port: ");
		result.append(port);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(", httpHeaders: ");
		result.append(httpHeaders);
		result.append(')');
		return result.toString();
	}

} //HTTPGetActionImpl
