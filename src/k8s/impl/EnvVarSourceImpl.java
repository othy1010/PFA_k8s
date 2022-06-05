/**
 */
package k8s.impl;

import k8s.EnvVarSource;
import k8s.K8sPackage;
import k8s.ObjectFieldSelector;
import k8s.SecretKeySelector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Env Var Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.EnvVarSourceImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link k8s.impl.EnvVarSourceImpl#getSecretKeyRef <em>Secret Key Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvVarSourceImpl extends MinimalEObjectImpl.Container implements EnvVarSource {
	/**
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected SecretKeySelector fieldRef;

	/**
	 * The cached value of the '{@link #getSecretKeyRef() <em>Secret Key Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKeyRef()
	 * @generated
	 * @ordered
	 */
	protected ObjectFieldSelector secretKeyRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvVarSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.ENV_VAR_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretKeySelector getFieldRef() {
		if (fieldRef != null && fieldRef.eIsProxy()) {
			InternalEObject oldFieldRef = (InternalEObject)fieldRef;
			fieldRef = (SecretKeySelector)eResolveProxy(oldFieldRef);
			if (fieldRef != oldFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.ENV_VAR_SOURCE__FIELD_REF, oldFieldRef, fieldRef));
			}
		}
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretKeySelector basicGetFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(SecretKeySelector newFieldRef) {
		SecretKeySelector oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.ENV_VAR_SOURCE__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFieldSelector getSecretKeyRef() {
		if (secretKeyRef != null && secretKeyRef.eIsProxy()) {
			InternalEObject oldSecretKeyRef = (InternalEObject)secretKeyRef;
			secretKeyRef = (ObjectFieldSelector)eResolveProxy(oldSecretKeyRef);
			if (secretKeyRef != oldSecretKeyRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF, oldSecretKeyRef, secretKeyRef));
			}
		}
		return secretKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFieldSelector basicGetSecretKeyRef() {
		return secretKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretKeyRef(ObjectFieldSelector newSecretKeyRef) {
		ObjectFieldSelector oldSecretKeyRef = secretKeyRef;
		secretKeyRef = newSecretKeyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF, oldSecretKeyRef, secretKeyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.ENV_VAR_SOURCE__FIELD_REF:
				if (resolve) return getFieldRef();
				return basicGetFieldRef();
			case K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF:
				if (resolve) return getSecretKeyRef();
				return basicGetSecretKeyRef();
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
			case K8sPackage.ENV_VAR_SOURCE__FIELD_REF:
				setFieldRef((SecretKeySelector)newValue);
				return;
			case K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF:
				setSecretKeyRef((ObjectFieldSelector)newValue);
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
			case K8sPackage.ENV_VAR_SOURCE__FIELD_REF:
				setFieldRef((SecretKeySelector)null);
				return;
			case K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF:
				setSecretKeyRef((ObjectFieldSelector)null);
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
			case K8sPackage.ENV_VAR_SOURCE__FIELD_REF:
				return fieldRef != null;
			case K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF:
				return secretKeyRef != null;
		}
		return super.eIsSet(featureID);
	}

} //EnvVarSourceImpl
