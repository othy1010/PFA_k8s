/**
 */
package k8s.impl;

import k8s.ApiVersion;
import k8s.K8sPackage;
import k8s.ObjectFieldSelector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Field Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.ObjectFieldSelectorImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link k8s.impl.ObjectFieldSelectorImpl#getFieldPath <em>Field Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectFieldSelectorImpl extends MinimalEObjectImpl.Container implements ObjectFieldSelector {
	/**
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final ApiVersion API_VERSION_EDEFAULT = ApiVersion.V1;

	/**
	 * The cached value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected ApiVersion apiVersion = API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldPath() <em>Field Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldPath()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldPath() <em>Field Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldPath()
	 * @generated
	 * @ordered
	 */
	protected String fieldPath = FIELD_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFieldSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.OBJECT_FIELD_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiVersion getApiVersion() {
		return apiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiVersion(ApiVersion newApiVersion) {
		ApiVersion oldApiVersion = apiVersion;
		apiVersion = newApiVersion == null ? API_VERSION_EDEFAULT : newApiVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.OBJECT_FIELD_SELECTOR__API_VERSION, oldApiVersion, apiVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldPath() {
		return fieldPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldPath(String newFieldPath) {
		String oldFieldPath = fieldPath;
		fieldPath = newFieldPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.OBJECT_FIELD_SELECTOR__FIELD_PATH, oldFieldPath, fieldPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.OBJECT_FIELD_SELECTOR__API_VERSION:
				return getApiVersion();
			case K8sPackage.OBJECT_FIELD_SELECTOR__FIELD_PATH:
				return getFieldPath();
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
			case K8sPackage.OBJECT_FIELD_SELECTOR__API_VERSION:
				setApiVersion((ApiVersion)newValue);
				return;
			case K8sPackage.OBJECT_FIELD_SELECTOR__FIELD_PATH:
				setFieldPath((String)newValue);
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
			case K8sPackage.OBJECT_FIELD_SELECTOR__API_VERSION:
				setApiVersion(API_VERSION_EDEFAULT);
				return;
			case K8sPackage.OBJECT_FIELD_SELECTOR__FIELD_PATH:
				setFieldPath(FIELD_PATH_EDEFAULT);
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
			case K8sPackage.OBJECT_FIELD_SELECTOR__API_VERSION:
				return apiVersion != API_VERSION_EDEFAULT;
			case K8sPackage.OBJECT_FIELD_SELECTOR__FIELD_PATH:
				return FIELD_PATH_EDEFAULT == null ? fieldPath != null : !FIELD_PATH_EDEFAULT.equals(fieldPath);
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
		result.append(" (apiVersion: ");
		result.append(apiVersion);
		result.append(", fieldPath: ");
		result.append(fieldPath);
		result.append(')');
		return result.toString();
	}

} //ObjectFieldSelectorImpl
