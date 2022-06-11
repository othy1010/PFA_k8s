/**
 */
package k8s.impl;

import k8s.EnvVarSource;
import k8s.K8sPackage;
import k8s.ObjectFieldSelector;
import k8s.SecretKeySelector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected SecretKeySelector fieldRef;

	/**
	 * The cached value of the '{@link #getSecretKeyRef() <em>Secret Key Ref</em>}' containment reference.
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
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldRef(SecretKeySelector newFieldRef, NotificationChain msgs) {
		SecretKeySelector oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.ENV_VAR_SOURCE__FIELD_REF, oldFieldRef, newFieldRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(SecretKeySelector newFieldRef) {
		if (newFieldRef != fieldRef) {
			NotificationChain msgs = null;
			if (fieldRef != null)
				msgs = ((InternalEObject)fieldRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.ENV_VAR_SOURCE__FIELD_REF, null, msgs);
			if (newFieldRef != null)
				msgs = ((InternalEObject)newFieldRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.ENV_VAR_SOURCE__FIELD_REF, null, msgs);
			msgs = basicSetFieldRef(newFieldRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.ENV_VAR_SOURCE__FIELD_REF, newFieldRef, newFieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFieldSelector getSecretKeyRef() {
		return secretKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecretKeyRef(ObjectFieldSelector newSecretKeyRef, NotificationChain msgs) {
		ObjectFieldSelector oldSecretKeyRef = secretKeyRef;
		secretKeyRef = newSecretKeyRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF, oldSecretKeyRef, newSecretKeyRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretKeyRef(ObjectFieldSelector newSecretKeyRef) {
		if (newSecretKeyRef != secretKeyRef) {
			NotificationChain msgs = null;
			if (secretKeyRef != null)
				msgs = ((InternalEObject)secretKeyRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF, null, msgs);
			if (newSecretKeyRef != null)
				msgs = ((InternalEObject)newSecretKeyRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF, null, msgs);
			msgs = basicSetSecretKeyRef(newSecretKeyRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF, newSecretKeyRef, newSecretKeyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.ENV_VAR_SOURCE__FIELD_REF:
				return basicSetFieldRef(null, msgs);
			case K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF:
				return basicSetSecretKeyRef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getFieldRef();
			case K8sPackage.ENV_VAR_SOURCE__SECRET_KEY_REF:
				return getSecretKeyRef();
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
